import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule} from '@angular/router';
import {LeaveMgmtComponent} from "./leave-mgmt.component";
import {ApplyLeaveComponent} from "./apply-leave/apply-leave.component";
@NgModule({
    imports: [CommonModule,
        RouterModule.forChild([])
    ],
    declarations: [LeaveMgmtComponent, ApplyLeaveComponent
    ],
    providers: [],
    exports: []
})

export class LeaveMgmtModule {

}