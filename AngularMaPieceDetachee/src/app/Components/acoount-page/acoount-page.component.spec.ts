import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AcoountPageComponent } from './acoount-page.component';

describe('AcoountPageComponent', () => {
  let component: AcoountPageComponent;
  let fixture: ComponentFixture<AcoountPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AcoountPageComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AcoountPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
