package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a company contact.
 */
public class CompanyContactDeleteGraphQLQuery extends GraphQLQuery {
  public CompanyContactDeleteGraphQLQuery(String companyContactId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }
  }

  public CompanyContactDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyContactDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyContactId;

    private String queryName;

    public CompanyContactDeleteGraphQLQuery build() {
      return new CompanyContactDeleteGraphQLQuery(companyContactId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the company contact to delete.
     */
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      this.fieldsSet.add("companyContactId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
