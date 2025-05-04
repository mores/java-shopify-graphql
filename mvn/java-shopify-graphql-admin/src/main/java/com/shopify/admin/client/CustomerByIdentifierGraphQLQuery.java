package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CustomerIdentifierInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Return a customer by an identifier.
 */
public class CustomerByIdentifierGraphQLQuery extends GraphQLQuery {
  public CustomerByIdentifierGraphQLQuery(CustomerIdentifierInput identifier, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
  }

  public CustomerByIdentifierGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "customerByIdentifier";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CustomerIdentifierInput identifier;

    private String queryName;

    public CustomerByIdentifierGraphQLQuery build() {
      return new CustomerByIdentifierGraphQLQuery(identifier, queryName, fieldsSet);
               
    }

    /**
     * The identifier of the customer.
     */
    public Builder identifier(CustomerIdentifierInput identifier) {
      this.identifier = identifier;
      this.fieldsSet.add("identifier");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
