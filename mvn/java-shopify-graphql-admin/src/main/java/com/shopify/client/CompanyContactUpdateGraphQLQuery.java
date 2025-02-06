package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CompanyContactInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a company contact.
 */
public class CompanyContactUpdateGraphQLQuery extends GraphQLQuery {
  public CompanyContactUpdateGraphQLQuery(String companyContactId, CompanyContactInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CompanyContactUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyContactUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String companyContactId;

    private CompanyContactInput input;

    private String queryName;

    public CompanyContactUpdateGraphQLQuery build() {
      return new CompanyContactUpdateGraphQLQuery(companyContactId, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the company contact to be updated.
     */
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      this.fieldsSet.add("companyContactId");
      return this;
    }

    /**
     * The fields to use to update the company contact.
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
