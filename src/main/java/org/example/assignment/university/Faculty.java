package org.example.assignment.university;

public sealed class Faculty implements Educational permits BusinessFaculty, EngineeringFaculty, HumanitiesFaculty {


}