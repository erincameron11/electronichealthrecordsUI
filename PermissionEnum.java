package application;

public enum PermissionEnum {
	PATIENT("Patient"),
	HCP("HealthCarePractitioner");
	
	private String permission;

	// Constructor
    PermissionEnum(String permission){
        this.permission = permission;
    }

    @Override
    public String toString() { 
    	return permission; 
    }
}
