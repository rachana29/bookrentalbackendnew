import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule} from '@angular/router';
import {RecruitmentComponent} from "./recruitment.component";
import {CreateJobComponent} from "./create-job/create-job.component";
@NgModule({
    imports: [CommonModule,
        RouterModule.forChild([])
    ],
    declarations: [
        RecruitmentComponent,
        CreateJobComponent
    ],
    providers: [],
    exports: []
})

export class RecruitmentModule {

}