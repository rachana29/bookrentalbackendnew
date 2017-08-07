import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {IssueBookComponent} from './issuebook.component';
import {RouterModule} from '@angular/router';
import {RecruitmentComponent} from "../order details/recruitment.component";
import {RecruitmentModule} from "../order details/recruitment.module";
@NgModule({
    imports: [CommonModule,
        RouterModule.forChild([])
    ],
    declarations: [IssueBookComponent
    ],
    providers: [],
    exports: []
})

export class IssuebookModule {

}
