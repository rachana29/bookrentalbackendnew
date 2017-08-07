import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {NavBarComponent} from './navbar.component';
import {RouterModule} from '@angular/router';
import {ReportsComponent} from '../return book/reports.component';
import {AttendanceReportComponent} from '../return book/attendance/attendance.component';
import {IssueBookComponent} from '../issuebook/issuebook.component';
import {RecruitmentComponent} from '../order details/recruitment.component';
import {ReportModule} from '../return book/reports.module';
import {CreateJobComponent} from '../order details/create-job/create-job.component';
import {TimeSheetComponent} from '../book search/time-sheet.component';
import {FillTimeSheetComponent} from '../book search/fill-timesheet/fill-timesheet.component';
import {PRMComponent} from '../Edit book detail/prm.component';
import {ProjectsComponent} from '../Edit book detail/projects/projects.component';
import {EmpDetailsComponent} from '../add book/emp-details/emp-details.component';
import {PIMComponent} from '../add book/pim.component';
import {TeamComponent} from '../delete book/team.component';
import {UserComponent} from '../delete book/user/user.component';
import {UserGroupComponent} from '../delete book/user-group/user-group.component';
import {UserRoleComponent} from '../delete book/user-role/user-role.component';
import {LeaveMgmtComponent} from '../book issue detail/leave-mgmt.component';
import {ApplyLeaveComponent} from '../book issue detail/apply-leave/apply-leave.component';
import {IssuebookModule} from '../issuebook/issuebook.module';

@NgModule({
    imports: [CommonModule,
        ReportModule,
      IssuebookModule
      ,
        RouterModule.forChild([
            {
                path: 'control',
                component: NavBarComponent,
                children: [
                    {
                        path: 'return book',
                        component: ReportsComponent,
                        children: [
                            {
                                path: 'attendance',
                                component: AttendanceReportComponent
                            },

                            {
                                path: '', redirectTo: 'performance', pathMatch: 'full'
                            }
                        ]
                    },
                    {
                        path: 'issuebook',
                        component: IssueBookComponent
                    },
                    {
                        path: 'book search',
                        component: TimeSheetComponent,
                        children: [
                            {
                                path: 'fill-book search',
                                component: FillTimeSheetComponent
                            },
                            {
                                path: '', redirectTo: 'fill-book search', pathMatch: 'full'
                            }
                        ]
                    },
                    {
                        path: 'add book',
                        component: PIMComponent,
                        children: [
                            {
                                path: 'emp-details',
                                component: EmpDetailsComponent
                            },
                            {
                                path: 'emp-history',
                                component: EmpDetailsComponent
                            },
                            {
                                path: '', redirectTo: 'emp-details', pathMatch: 'full'
                            }
                        ]
                    },
                    {
                        path: 'order details',
                        component: RecruitmentComponent,
                        children: [
                            {
                                path: 'create-job',
                                component: CreateJobComponent
                            },
                            {
                                path: '', redirectTo: 'create-job', pathMatch: 'full'
                            }

                        ]
                    },
                    {
                        path: 'Edit book detail',
                        component: PRMComponent,
                        children: [
                            {
                                path: 'projects',
                                component: ProjectsComponent
                            },
                            {
                                path: 'add-project',
                                component: ProjectsComponent
                            },
                            {
                                path: '', redirectTo: 'projects', pathMatch: 'full'
                            }
                        ]
                    },
                    {
                        path: 'delete book',
                        component: TeamComponent,
                        children: [
                            {
                                path: 'user',
                                component: UserComponent
                            },
                            {
                                path: 'user-group',
                                component: UserGroupComponent
                            },
                            {
                                path: 'user-role',
                                component: UserRoleComponent
                            },
                            {
                             path: '', redirectTo: 'user', pathMatch: 'full'
                             }
                        ]
                    },
                    {
                        path: 'book issue detail',
                        component: LeaveMgmtComponent,
                        children: [
                            {
                                path: 'apply-leave',
                                component: ApplyLeaveComponent
                            },
                            {
                                path: 'view-leave',
                                component: ApplyLeaveComponent
                            },
                            {
                                path: '', redirectTo: 'apply-leave', pathMatch: 'full'
                            }
                        ]
                    },
                ]
            },

        ])
    ],
    declarations: [NavBarComponent],
    exports: [NavBarComponent, RouterModule]
})

export class NavBarModule {

}
