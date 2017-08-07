import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule} from '@angular/router';
import {TimeSheetComponent} from "./time-sheet.component";
import {FillTimeSheetComponent} from "./fill-timesheet/fill-timesheet.component";
@NgModule({
    imports: [CommonModule,
        RouterModule.forChild([])
    ],
    declarations: [TimeSheetComponent,FillTimeSheetComponent
    ],
    providers: [],
    exports: []
})

export class TimeSheetModule {

}