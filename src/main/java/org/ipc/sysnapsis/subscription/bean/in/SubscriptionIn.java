package org.ipc.sysnapsis.subscription.bean.in;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by Ghislain on 21/08/2016.
 */
@ApiModel(value = "Subscription", description = "The subscription on a project IN model")
public class SubscriptionIn {
    @NotNull
    @ApiModelProperty(value = "'Subcription' IN projectID", dataType = "java.Lang.String")
    private String projectID;

    @NotNull
    @ApiModelProperty(value = "'Subcription' IN collaboratorID", dataType = "java.Lang.String")
    private String collaboratorID;

    @ApiModelProperty(value = "'Subcription' IN status", dataType = "java.Lang.String")
    private String status;

    public SubscriptionIn() {
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getCollaboratorID() {
        return collaboratorID;
    }

    public void setCollaboratorID(String collaboratorID) {
        this.collaboratorID = collaboratorID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SubscriptionIn{" +
                "projectID='" + projectID + '\'' +
                ", collaboratorID='" + collaboratorID + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
