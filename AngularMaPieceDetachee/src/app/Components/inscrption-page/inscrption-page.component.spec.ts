import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InscrptionPageComponent } from './inscrption-page.component';

describe('InscrptionPageComponent', () => {
  let component: InscrptionPageComponent;
  let fixture: ComponentFixture<InscrptionPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InscrptionPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InscrptionPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
