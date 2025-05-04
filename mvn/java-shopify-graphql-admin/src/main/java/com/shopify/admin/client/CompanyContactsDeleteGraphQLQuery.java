package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Deletes one or more company contacts.
 */
public class CompanyContactsDeleteGraphQLQuery extends GraphQLQuery {
  public CompanyContactsDeleteGraphQLQuery(List<String> companyContactIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyContactIds != null || fieldsSet.contains("companyContactIds")) {
        getInput().put("companyContactIds", companyContactIds);
    }
  }

  public CompanyContactsDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyContactsDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> companyContactIds;

    private String queryName;

    public CompanyContactsDeleteGraphQLQuery build() {
      return new CompanyContactsDeleteGraphQLQuery(companyContactIds, queryName, fieldsSet);
               
    }

    /**
     * The list of IDs of the company contacts to delete.
     */
    public Builder companyContactIds(List<String> companyContactIds) {
      this.companyContactIds = companyContactIds;
      this.fieldsSet.add("companyContactIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
