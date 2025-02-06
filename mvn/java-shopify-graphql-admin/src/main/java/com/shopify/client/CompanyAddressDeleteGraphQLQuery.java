package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a company address.
 */
public class CompanyAddressDeleteGraphQLQuery extends GraphQLQuery {
  public CompanyAddressDeleteGraphQLQuery(String addressId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (addressId != null || fieldsSet.contains("addressId")) {
        getInput().put("addressId", addressId);
    }
  }

  public CompanyAddressDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyAddressDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String addressId;

    private String queryName;

    public CompanyAddressDeleteGraphQLQuery build() {
      return new CompanyAddressDeleteGraphQLQuery(addressId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the address to delete.
     */
    public Builder addressId(String addressId) {
      this.addressId = addressId;
      this.fieldsSet.add("addressId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
