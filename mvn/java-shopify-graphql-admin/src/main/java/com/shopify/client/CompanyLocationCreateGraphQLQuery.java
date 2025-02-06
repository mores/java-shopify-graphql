package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CompanyLocationInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a company location.
 */
public class CompanyLocationCreateGraphQLQuery extends GraphQLQuery {
  public CompanyLocationCreateGraphQLQuery(String companyId, CompanyLocationInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyId != null || fieldsSet.contains("companyId")) {
        getInput().put("companyId", companyId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CompanyLocationCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyId;

    private CompanyLocationInput input;

    private String queryName;

    public CompanyLocationCreateGraphQLQuery build() {
      return new CompanyLocationCreateGraphQLQuery(companyId, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the company that the company location belongs to.
     */
    public Builder companyId(String companyId) {
      this.companyId = companyId;
      this.fieldsSet.add("companyId");
      return this;
    }

    /**
     * The fields to use to create the company location.
     */
    public Builder input(CompanyLocationInput input) {
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
