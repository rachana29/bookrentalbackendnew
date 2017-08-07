import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule} from '@angular/router';
import {PIMComponent} from "./pim.component";
import {EmpDetailsComponent} from "./emp-details/emp-details.component";
@NgModule({
    imports: [CommonModule,
        RouterModule.forChild([])
    ],
    declarations: [PIMComponent,EmpDetailsComponent
    ],
    providers: [],
    exports: []
})

export class PIMModule {

}