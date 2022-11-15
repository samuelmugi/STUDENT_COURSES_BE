package com.mugi.service;

import com.mugi.Student;
import com.mugi.StudentCourseServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * @author Mugi
 */
@Service
public class StudentCourseClientService {

    @GrpcClient("mugi-author-server-service")
    StudentCourseServiceGrpc.StudentCourseServiceBlockingStub synchronousServerServiceClient;

    public Student getStudent(int studentId) {
        var studentRequest = Student.newBuilder().setStudentId(studentId).build();
        var studentResponse = synchronousServerServiceClient.getStudent(studentRequest);
        return studentResponse;
    }
}
