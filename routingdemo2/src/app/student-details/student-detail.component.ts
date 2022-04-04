import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
  styleUrls: ['./student-detail.component.css']
})
export class StudentDetailComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }
  student = [

    {"id": 1,"name":"suma"},
  
    {"id": 2,"name":"gowda"},
  
    {"id": 3,"name":"varun"},
  
    {"id": 4,"name":"Reshma"},
  
    {"id": 5,"name":"Bhuvan"}
  
  ]
  onSelect(student:any){

    this.router.navigate(['/students', student.id]);
    
    }
}
