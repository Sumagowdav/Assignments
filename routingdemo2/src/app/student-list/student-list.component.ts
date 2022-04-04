import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  public studentId: any;
  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {
    let id =(this.route.snapshot.paramMap.get('id'));
    this.studentId= id;
  
  }

}
