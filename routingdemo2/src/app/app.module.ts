import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule, routingcomponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentDetailComponent } from './student-detail/student-detail.component';
import { TeacherDetailComponent } from './teacher-detail/teacher-detail.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
//{path: '**', component:PagenotfoundComponent}
@NgModule({
  declarations: [
    AppComponent,
    routingcomponents,
   
    //StudentDetailComponent,
    //TeacherDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
