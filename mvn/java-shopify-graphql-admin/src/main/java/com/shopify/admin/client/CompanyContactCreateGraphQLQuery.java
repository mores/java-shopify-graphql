package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CompanyContactInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a company contact and the associated customer.
 */
public class CompanyContactCreateGraphQLQuery extends GraphQLQuery {
  public CompanyContactCreateGraphQLQuery(String companyId, CompanyContactInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyId != null || fieldsSet.contains("companyId")) {
        getInput().put("companyId", companyId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CompanyContactCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyContactCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyId;

    private CompanyContactInput input;

    private String queryName;

    public CompanyContactCreateGraphQLQuery build() {
      return new CompanyContactCreateGraphQLQuery(companyId, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the company that the company contact belongs to.
     */
    public Builder companyId(String companyId) {
      this.companyId = companyId;
      this.fieldsSet.add("companyId");
      return this;
    }

    /**
     * The fields to use to create the company contact.
     */
    public Builder input(CompanyContactInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
