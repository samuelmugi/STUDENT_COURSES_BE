package com.mugi.service;

import com.mugi.Student;
import com.mugi.StudentCourseServiceGrpc;
import com.mugi.TempDb;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author Mugi
 */
@GrpcService
public class StudentCourseServerService extends StudentCourseServiceGrpc.StudentCourseServiceImplBase {
    @Override
    public void getStudent(Student request, StreamObserver<Student> responseObserver) {
        TempDb.getStudentsFromTempDb().parallelStream()
                .filter(student -> student.getStudentId() == request.getStudentId())
                .findFirst()
                .ifPresent(responseObserver::onNext);
        responseObserver.onCompleted();
    }
}
