package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ValidationUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Update a validation.
 */
public class ValidationUpdateGraphQLQuery extends GraphQLQuery {
  public ValidationUpdateGraphQLQuery(ValidationUpdateInput validation, String id, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (validation != null || fieldsSet.contains("validation")) {
        getInput().put("validation", validation);
    }if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ValidationUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "validationUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ValidationUpdateInput validation;

    private String id;

    private String queryName;

    public ValidationUpdateGraphQLQuery build() {
      return new ValidationUpdateGraphQLQuery(validation, id, queryName, fieldsSet);
               
    }

    /**
     * The input fields to update a validation.
     */
    public Builder validation(ValidationUpdateInput validation) {
      this.validation = validation;
      this.fieldsSet.add("validation");
      return this;
    }

    /**
     * The ID representing the validation to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
