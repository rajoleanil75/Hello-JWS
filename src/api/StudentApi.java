package api;

import db.Student;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/student-api")
@WebService
public class StudentApi {

    @GET
    @Path("viewAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List getAllStudents()
    {
        List<db.Student> studList = new ArrayList<>();

        db.Student s1 = new Student();  //First Object
        s1.setRoll(1);
        s1.setName("ABC");
        studList.add(s1);
        db.Student s2 = new Student();  //Second Object
        s2.setRoll(2);
        s2.setName("PQR");
        studList.add(s2);
        db.Student s3 = new Student();  //Third Object
        s3.setRoll(3);
        s3.setName("XYZ");
        studList.add(s3);

        return studList;
    }

    @POST
    @Path("addStudent")
    @Produces(MediaType.TEXT_PLAIN)
    public int addStudent(@FormParam("student_roll")int roll, @FormParam("student_name") String name)
    {
        System.out.println("\nStudent Information : \n\tRoll No : "+roll+"\n\tName : "+name);
        return 1;
    }

}
