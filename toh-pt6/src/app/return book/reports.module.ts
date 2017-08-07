import {NgModule} from '@angular/core';
import {ReportsComponent} from './reports.component';
import {CommonModule} from '@angular/common';
import {AttendanceReportComponent} from './attendance/attendance.component';
import {BookReturnComponent} from './return/return.component';
import {RouterModule} from '@angular/router';
@NgModule({
    imports: [CommonModule,
        RouterModule.forChild([])
    ],
    declarations: [ReportsComponent,
        AttendanceReportComponent,
      BookReturnComponent],
    providers: []
})

export class ReportModule {
    public title: string = 'return book sidebar';

}
