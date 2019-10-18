package api;

import DB.Student;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
        List<DB.Student>  studList = new ArrayList<>();

        DB.Student s1 = new Student();
        s1.setRoll(1);
        s1.setName("ABC");
        studList.add(s1);

        DB.Student s2 = new Student();
        s2.setRoll(2);
        s2.setName("PQR");
        studList.add(s2);

        DB.Student s3 = new Student();
        s3.setRoll(3);
        s3.setName("XYZ");
        studList.add(s3);

        return studList;
    }

}
