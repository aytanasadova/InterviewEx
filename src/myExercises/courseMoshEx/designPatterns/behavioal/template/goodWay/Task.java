package myExercises.courseMoshEx.designPatterns.behavioal.template.goodWay;

import myExercises.courseMoshEx.designPatterns.behavioal.template.badWay.AuditTrail;

public abstract class Task {
    AuditTrail auditTrail;

    public Task() {
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail =auditTrail;
    }

    public void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();

}
