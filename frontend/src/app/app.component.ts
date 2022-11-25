import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { environment } from 'environments/environment';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
onSearchTextEntered($event: string) {
throw new Error('Method not implemented.');
}
  title = 'Project-FrontEnd';

  private api: string = environment.apiUrl;

  constructor(public http:HttpClient){}
  public ping(){
    this.http.get(`${this.api}/login`).subscribe(
      data => console.log(data),
      err => console.log(err)
    );
  }

}
