package com.Client.AuthentificationClients.Controllers;
import com.Client.AuthentificationClients.Entity.Client;
import com.Client.AuthentificationClients.Service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("api/v1/Client")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientServices;
    @PostMapping(value= "/save")
    @Transactional
    public void saveStudent(
            @RequestParam("studentemail") String studentemail,
            @RequestParam("studentname") String studentname,
            @RequestParam("studentaddress") String studentaddress,
            @RequestParam("studentbirth") String studentbirth,
            @RequestParam("mobile") String mobile,
            @RequestParam("CV") MultipartFile CV,
            @RequestParam("profile_image") MultipartFile profile_image
            ) {
        clientServices.saveClient(studentname,studentaddress,mobile,studentemail,studentbirth,CV,profile_image);
    }

    @GetMapping(value= "/getall")
    private Iterable<Client>getStudents(){

        return clientServices.listAll();
    }
    @PutMapping(value = "/edit/{id}")
    private Client update(@RequestBody Client client,@PathVariable(name="id")String _id){

        client.set_id(_id);
        clientServices.saveorUpdate(client);
        return client;
    }
    @DeleteMapping("/delete/{id}")
    private void deleteStudent(@PathVariable("id")String  _id){
        clientServices.deleteClient(_id);

    }
    @RequestMapping("/search/{id}")
    private Client getStudents(@PathVariable(name="id")String studentid){
        return clientServices.getStudentByID(studentid);}


}
