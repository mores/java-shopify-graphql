package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ValidationCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a validation.
 */
public class ValidationCreateGraphQLQuery extends GraphQLQuery {
  public ValidationCreateGraphQLQuery(ValidationCreateInput validation, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (validation != null || fieldsSet.contains("validation")) {
        getInput().put("validation", validation);
    }
  }

  public ValidationCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "validationCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ValidationCreateInput validation;

    private String queryName;

    public ValidationCreateGraphQLQuery build() {
      return new ValidationCreateGraphQLQuery(validation, queryName, fieldsSet);
               
    }

    /**
     * The input fields for a new validation.
     */
    public Builder validation(ValidationCreateInput validation) {
      this.validation = validation;
      this.fieldsSet.add("validation");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
