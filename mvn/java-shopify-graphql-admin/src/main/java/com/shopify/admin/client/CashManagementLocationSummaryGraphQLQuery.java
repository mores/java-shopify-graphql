package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Summary of cash management data for a location.
 */
public class CashManagementLocationSummaryGraphQLQuery extends GraphQLQuery {
  public CashManagementLocationSummaryGraphQLQuery(String locationId, LocalDate startDate,
      LocalDate endDate, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (startDate != null || fieldsSet.contains("startDate")) {
        getInput().put("startDate", startDate);
    }if (endDate != null || fieldsSet.contains("endDate")) {
        getInput().put("endDate", endDate);
    }
  }

  public CashManagementLocationSummaryGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "cashManagementLocationSummary";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String locationId;

    private LocalDate startDate;

    private LocalDate endDate;

    private String queryName;

    public CashManagementLocationSummaryGraphQLQuery build() {
      return new CashManagementLocationSummaryGraphQLQuery(locationId, startDate, endDate, queryName, fieldsSet);
               
    }

    /**
     * Identifies the location to get the summary for.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * The start date to summarize from.
     */
    public Builder startDate(LocalDate startDate) {
      this.startDate = startDate;
      this.fieldsSet.add("startDate");
      return this;
    }

    /**
     * The end date to summarize to.
     */
    public Builder endDate(LocalDate endDate) {
      this.endDate = endDate;
      this.fieldsSet.add("endDate");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
