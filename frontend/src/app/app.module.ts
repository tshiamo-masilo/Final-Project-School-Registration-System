import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { appRoutingModule } from './app.routing';
import { DashboardModule } from './dashboard/dashboard.module';

// import { UserModule } from './user/user.module';


import {MatToolbarModule} from '@angular/material/toolbar';
import {AppComponent } from './app.component';


import {BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MdbCollapseModule } from 'mdb-angular-ui-kit/collapse';



import {HomeComponent } from './home/home.component';
import {AboutComponent } from './about/about.component';
import {ContactComponent} from './contact/contact.component';

import { AccountComponent } from './account/account.component';
import { ApplicationComponent } from './application/application.component';
import { SchoolComponent } from './school/school.component';

// import { LoginComponent } from './user/login/login.component';
import { SignupComponent } from './user/signup/signup.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { UserModule } from './user/user.module';

@NgModule({
  declarations: [
    AppComponent,
    ApplicationComponent,
    HomeComponent,
    AboutComponent,
    ContactComponent,
    AccountComponent,
    ApplicationComponent,
    SchoolComponent,
  ],
  imports: [
    BrowserModule,
    MatToolbarModule,
    BrowserAnimationsModule,
    UserModule,
    MdbCollapseModule,
    appRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  bootstrap: [AppComponent]
  
})

export class AppModule { }
