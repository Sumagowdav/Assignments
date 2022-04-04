import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { StudentDetailComponent } from './student-detail/student-detail.component';
import { StudentListComponent } from './student-list/student-list.component';
import { TeacherDetailComponent } from './teacher-detail/teacher-detail.component';

const routes: Routes = [
  {path: '' ,redirectTo: '/departments',pathMatch:'full'},
  {path: 'student' ,component:StudentDetailComponent},
  {  path: 'teacher' ,component: TeacherDetailComponent},
  {path: 'students/:id' , component:StudentListComponent},
  
  
 
  {path: '**', component:PagenotfoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingcomponents =[StudentDetailComponent,TeacherDetailComponent, PagenotfoundComponent,
  StudentListComponent]
