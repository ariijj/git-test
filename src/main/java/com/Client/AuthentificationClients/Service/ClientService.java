package com.Client.AuthentificationClients.Service;

import com.Client.AuthentificationClients.Entity.Client;
import com.Client.AuthentificationClients.Repo.ClientRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
@RequiredArgsConstructor
public class ClientService {
    @Autowired
    private final ClientRepo repo;


    public void saveorUpdate(Client clients) {

        repo.save(clients);
    }

    public Iterable<Client> listAll() {
        return this.repo.findAll();
    }

    public void deleteClient(String id) {
        repo.deleteById(id);
    }

    public Client getStudentByID(String clientid) {
        return repo.findById(clientid).get();
    }

    public void saveClient(
            String studentname,
            String studentemail,
            String studentbirth,
            String studentaddress,
            String mobile,
            MultipartFile CV,
            MultipartFile profile_image) {
        Client client = new Client(studentname, studentaddress, mobile, studentemail, studentbirth, CV, profile_image);
        repo.save(client);

    }

    ;

}

