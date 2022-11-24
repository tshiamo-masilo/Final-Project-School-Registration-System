import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { RequirementsServicesService } from './services/requirements-services.service';

@Component({
  selector: 'app-requirements',
  templateUrl: './requirements.component.html',
  styleUrls: ['./requirements.component.css']
})
export class RequirementsComponent implements OnInit {

  form: FormGroup = new FormGroup({});
  streamlist: any[] = ["Select a stream", "1.Science", "2.Commerce", "3.General", "4.Mix1", "5.Mix2"]
  stream: any;
  selectedStream: any = '';
  num1: any = 0;

  subjectlist: any[] = ["Select a subject", "1.Maths", "2.English", "3.Xhosa", "4.EMS", "5.Tech"]
  subject: any;
  selectedSubject: any = '';
  num: any = 0;
  constructor(private formBuilder: FormBuilder, private service: RequirementsServicesService) { }

  formBinding() {
    this.form = this.formBuilder.group({
      streamId: [''],
      subjectId: [''],
      level: ['']

    })
  }
  onSelectedSubject(value: any) {
    this.subject = value;
    this.selectedSubject = value

    if (this.subject === this.subjectlist[0]) {
      this.num1 = 0;
    } else {
      this.num1 = 1;
    }
  }
  onSelectedStream(value: any) {
    this.stream = value;
    this.selectedStream = value

    if (this.stream === this.streamlist[0]) {
      this.num = 0;
    } else {
      this.num = 1;
    }
  }
  ngOnInit(): void {
    this.formBinding()

  }
  onSubmit() {
    if (this.selectedStream.length > 0 && this.selectedSubject.length > 0 && this.form.value.level.length > 0) {
      //sending form to database   
      alert("Subject Successfully submitted")
      this.form.get('streamId')?.setValue(this.selectedStream.substring(0, 1));
      this.form.get('subjectId')?.setValue(this.selectedSubject.substring(0, 1));
      console.log(this.form.value)
      this.service.submittingRequirements(this.form.value).subscribe((data: any) => {
        alert("Subject Successfully submitted")
        this.form.reset()
      })
    }
    else {
      alert("Fill all the required fields")
    }





  }

}
