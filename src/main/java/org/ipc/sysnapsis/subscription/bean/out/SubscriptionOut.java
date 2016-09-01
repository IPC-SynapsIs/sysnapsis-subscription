package org.ipc.sysnapsis.subscription.bean.out;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by Ghislain on 21/08/2016.
 */
@ApiModel(value = "'Subcription'", description = "The 'Subcription' OUT model")
public class SubscriptionOut {

    @NotNull
    @ApiModelProperty(value = "'Subcription' OUT projectID", dataType = "java.Lang.String")
    private String projectID;

    @NotNull
    @ApiModelProperty(value = "'Subcription' OUT collaboratorID", dataType = "java.Lang.String")
    private String collaboratorID;

    @ApiModelProperty(value = "'Subcription' OUT status", dataType = "java.Lang.String")
    private String status;

    public SubscriptionOut() {
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
        return "SubscriptionOut{" +
                "projectID='" + projectID + '\'' +
                ", collaboratorID='" + collaboratorID + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
