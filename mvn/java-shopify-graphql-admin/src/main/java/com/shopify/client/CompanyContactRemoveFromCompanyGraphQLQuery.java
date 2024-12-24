package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CompanyContactRemoveFromCompanyGraphQLQuery extends GraphQLQuery {
  public CompanyContactRemoveFromCompanyGraphQLQuery(String companyContactId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }
  }

  public CompanyContactRemoveFromCompanyGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyContactRemoveFromCompany";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyContactId;

    private String queryName;

    public CompanyContactRemoveFromCompanyGraphQLQuery build() {
      return new CompanyContactRemoveFromCompanyGraphQLQuery(companyContactId, queryName, fieldsSet);
               
    }

    
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
