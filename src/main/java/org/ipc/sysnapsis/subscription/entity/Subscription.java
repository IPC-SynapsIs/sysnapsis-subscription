package org.ipc.sysnapsis.subscription.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Ghislain on 21/08/2016.
 */
@Entity
public class Subscription {

    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column
    private String projetID;

    @Column
    private String collaboratorID;

    @Column
    private Date dateOfSubscription;

    @Column
    private String status;

    public Subscription() {
    }

    public Subscription(String projetID, String collaboratorID, Date dateOfSubscription, String status) {
        this.projetID = projetID;
        this.collaboratorID = collaboratorID;
        this.dateOfSubscription = dateOfSubscription;
        this.status = status;
    }

    public Subscription(UUID id, String projetID, String collaboratorID, Date dateOfSubscription, String status) {
        this.id = id;
        this.projetID = projetID;
        this.collaboratorID = collaboratorID;
        this.dateOfSubscription = dateOfSubscription;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getProjetID() {
        return projetID;
    }

    public void setProjetID(String projetID) {
        this.projetID = projetID;
    }

    public String getCollaboratorID() {
        return collaboratorID;
    }

    public void setCollaboratorID(String collaboratorID) {
        this.collaboratorID = collaboratorID;
    }

    public Date getDateOfSubscription() {
        return dateOfSubscription;
    }

    public void setDateOfSubscription(Date dateOfSubscription) {
        this.dateOfSubscription = dateOfSubscription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
