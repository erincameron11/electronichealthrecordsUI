package application;

public enum PermissionEnum {
	PATIENT("Patient"),
	HCP("HealthCarePractitioner"),
	ADMIN("Admin"),
	SUPER_ADMIN("SuperAdmin");
	
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
