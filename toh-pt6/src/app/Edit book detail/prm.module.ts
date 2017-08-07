import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterModule} from '@angular/router';
import {PRMComponent} from "./prm.component";
import {ProjectsComponent} from "./projects/projects.component";
@NgModule({
    imports: [CommonModule,
        RouterModule.forChild([])
    ],
    declarations: [PRMComponent, ProjectsComponent
    ],
    providers: [],
    exports: []
})

export class PRMModule {

}