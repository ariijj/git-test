package com.Client.AuthentificationClients.Repo;

import com.Client.AuthentificationClients.Entity.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends MongoRepository<Client,String> {
}
