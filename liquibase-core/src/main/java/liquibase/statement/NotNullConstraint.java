package liquibase.statement;

public class NotNullConstraint implements ColumnConstraint {
    private String columnName;
    /**
     * Default value is true
     */
    private boolean validateNullable = true;

    /* Some RDBMS (e.g. Oracle Database) have names for NOT NULL constraints. For Liquibase to make use of this
     * property, the Database-specific class must override supportsNotNullConstraintNames() to true.  */
    private String name;

    public NotNullConstraint() {
    }

    public NotNullConstraint(String columnName) {
        setColumnName(columnName);
    }

    public NotNullConstraint(String columnName, boolean validateNullable) {
        setColumnName(columnName);
        setValidateNullable(validateNullable);
    }


    public String getColumnName() {
        return columnName;
    }

    public NotNullConstraint setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    public String getName() {
        return name;
    }

    public NotNullConstraint setName(String name) {
        this.name = name;
        return this;
    }

    public boolean shouldValidateNullable() {
        return validateNullable;
    }

    public void setValidateNullable(boolean validateNullable) {
        this.validateNullable = validateNullable;
    }
}
