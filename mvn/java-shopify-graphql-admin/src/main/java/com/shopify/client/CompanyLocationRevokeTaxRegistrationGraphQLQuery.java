package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CompanyLocationRevokeTaxRegistrationGraphQLQuery extends GraphQLQuery {
  public CompanyLocationRevokeTaxRegistrationGraphQLQuery(String companyLocationId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyLocationId != null || fieldsSet.contains("companyLocationId")) {
        getInput().put("companyLocationId", companyLocationId);
    }
  }

  public CompanyLocationRevokeTaxRegistrationGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationRevokeTaxRegistration";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyLocationId;

    private String queryName;

    public CompanyLocationRevokeTaxRegistrationGraphQLQuery build() {
      return new CompanyLocationRevokeTaxRegistrationGraphQLQuery(companyLocationId, queryName, fieldsSet);
               
    }

    
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      this.fieldsSet.add("companyLocationId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
