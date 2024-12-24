package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;


public class MarketingEngagementInput {
  
  private LocalDate occurredOn;

  
  private Integer impressionsCount;

  
  private Integer viewsCount;

  
  private Integer clicksCount;

  
  private Integer sharesCount;

  
  private Integer favoritesCount;

  
  private Integer commentsCount;

  
  private Integer unsubscribesCount;

  
  private Integer complaintsCount;

  
  private Integer failsCount;

  
  private Integer sendsCount;

  
  private Integer uniqueViewsCount;

  
  private Integer uniqueClicksCount;

  
  private MoneyInput adSpend;

  
  private boolean isCumulative;

  
  private String utcOffset;

  
  private MoneyInput sales;

  
  private Integer sessionsCount;

  
  private String orders;

  
  private String firstTimeCustomers;

  
  private String returningCustomers;

  public MarketingEngagementInput() {
  }

  
  public LocalDate getOccurredOn() {
    return occurredOn;
  }

  public void setOccurredOn(LocalDate occurredOn) {
    this.occurredOn = occurredOn;
  }

  
  public Integer getImpressionsCount() {
    return impressionsCount;
  }

  public void setImpressionsCount(Integer impressionsCount) {
    this.impressionsCount = impressionsCount;
  }

  
  public Integer getViewsCount() {
    return viewsCount;
  }

  public void setViewsCount(Integer viewsCount) {
    this.viewsCount = viewsCount;
  }

  
  public Integer getClicksCount() {
    return clicksCount;
  }

  public void setClicksCount(Integer clicksCount) {
    this.clicksCount = clicksCount;
  }

  
  public Integer getSharesCount() {
    return sharesCount;
  }

  public void setSharesCount(Integer sharesCount) {
    this.sharesCount = sharesCount;
  }

  
  public Integer getFavoritesCount() {
    return favoritesCount;
  }

  public void setFavoritesCount(Integer favoritesCount) {
    this.favoritesCount = favoritesCount;
  }

  
  public Integer getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Integer commentsCount) {
    this.commentsCount = commentsCount;
  }

  
  public Integer getUnsubscribesCount() {
    return unsubscribesCount;
  }

  public void setUnsubscribesCount(Integer unsubscribesCount) {
    this.unsubscribesCount = unsubscribesCount;
  }

  
  public Integer getComplaintsCount() {
    return complaintsCount;
  }

  public void setComplaintsCount(Integer complaintsCount) {
    this.complaintsCount = complaintsCount;
  }

  
  public Integer getFailsCount() {
    return failsCount;
  }

  public void setFailsCount(Integer failsCount) {
    this.failsCount = failsCount;
  }

  
  public Integer getSendsCount() {
    return sendsCount;
  }

  public void setSendsCount(Integer sendsCount) {
    this.sendsCount = sendsCount;
  }

  
  public Integer getUniqueViewsCount() {
    return uniqueViewsCount;
  }

  public void setUniqueViewsCount(Integer uniqueViewsCount) {
    this.uniqueViewsCount = uniqueViewsCount;
  }

  
  public Integer getUniqueClicksCount() {
    return uniqueClicksCount;
  }

  public void setUniqueClicksCount(Integer uniqueClicksCount) {
    this.uniqueClicksCount = uniqueClicksCount;
  }

  
  public MoneyInput getAdSpend() {
    return adSpend;
  }

  public void setAdSpend(MoneyInput adSpend) {
    this.adSpend = adSpend;
  }

  
  public boolean getIsCumulative() {
    return isCumulative;
  }

  public void setIsCumulative(boolean isCumulative) {
    this.isCumulative = isCumulative;
  }

  
  public String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  
  public MoneyInput getSales() {
    return sales;
  }

  public void setSales(MoneyInput sales) {
    this.sales = sales;
  }

  
  public Integer getSessionsCount() {
    return sessionsCount;
  }

  public void setSessionsCount(Integer sessionsCount) {
    this.sessionsCount = sessionsCount;
  }

  
  public String getOrders() {
    return orders;
  }

  public void setOrders(String orders) {
    this.orders = orders;
  }

  
  public String getFirstTimeCustomers() {
    return firstTimeCustomers;
  }

  public void setFirstTimeCustomers(String firstTimeCustomers) {
    this.firstTimeCustomers = firstTimeCustomers;
  }

  
  public String getReturningCustomers() {
    return returningCustomers;
  }

  public void setReturningCustomers(String returningCustomers) {
    this.returningCustomers = returningCustomers;
  }

  @Override
  public String toString() {
    return "MarketingEngagementInput{occurredOn='" + occurredOn + "', impressionsCount='" + impressionsCount + "', viewsCount='" + viewsCount + "', clicksCount='" + clicksCount + "', sharesCount='" + sharesCount + "', favoritesCount='" + favoritesCount + "', commentsCount='" + commentsCount + "', unsubscribesCount='" + unsubscribesCount + "', complaintsCount='" + complaintsCount + "', failsCount='" + failsCount + "', sendsCount='" + sendsCount + "', uniqueViewsCount='" + uniqueViewsCount + "', uniqueClicksCount='" + uniqueClicksCount + "', adSpend='" + adSpend + "', isCumulative='" + isCumulative + "', utcOffset='" + utcOffset + "', sales='" + sales + "', sessionsCount='" + sessionsCount + "', orders='" + orders + "', firstTimeCustomers='" + firstTimeCustomers + "', returningCustomers='" + returningCustomers + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingEngagementInput that = (MarketingEngagementInput) o;
    return Objects.equals(occurredOn, that.occurredOn) &&
        Objects.equals(impressionsCount, that.impressionsCount) &&
        Objects.equals(viewsCount, that.viewsCount) &&
        Objects.equals(clicksCount, that.clicksCount) &&
        Objects.equals(sharesCount, that.sharesCount) &&
        Objects.equals(favoritesCount, that.favoritesCount) &&
        Objects.equals(commentsCount, that.commentsCount) &&
        Objects.equals(unsubscribesCount, that.unsubscribesCount) &&
        Objects.equals(complaintsCount, that.complaintsCount) &&
        Objects.equals(failsCount, that.failsCount) &&
        Objects.equals(sendsCount, that.sendsCount) &&
        Objects.equals(uniqueViewsCount, that.uniqueViewsCount) &&
        Objects.equals(uniqueClicksCount, that.uniqueClicksCount) &&
        Objects.equals(adSpend, that.adSpend) &&
        isCumulative == that.isCumulative &&
        Objects.equals(utcOffset, that.utcOffset) &&
        Objects.equals(sales, that.sales) &&
        Objects.equals(sessionsCount, that.sessionsCount) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(firstTimeCustomers, that.firstTimeCustomers) &&
        Objects.equals(returningCustomers, that.returningCustomers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occurredOn, impressionsCount, viewsCount, clicksCount, sharesCount, favoritesCount, commentsCount, unsubscribesCount, complaintsCount, failsCount, sendsCount, uniqueViewsCount, uniqueClicksCount, adSpend, isCumulative, utcOffset, sales, sessionsCount, orders, firstTimeCustomers, returningCustomers);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private LocalDate occurredOn;

    
    private Integer impressionsCount;

    
    private Integer viewsCount;

    
    private Integer clicksCount;

    
    private Integer sharesCount;

    
    private Integer favoritesCount;

    
    private Integer commentsCount;

    
    private Integer unsubscribesCount;

    
    private Integer complaintsCount;

    
    private Integer failsCount;

    
    private Integer sendsCount;

    
    private Integer uniqueViewsCount;

    
    private Integer uniqueClicksCount;

    
    private MoneyInput adSpend;

    
    private boolean isCumulative;

    
    private String utcOffset;

    
    private MoneyInput sales;

    
    private Integer sessionsCount;

    
    private String orders;

    
    private String firstTimeCustomers;

    
    private String returningCustomers;

    public MarketingEngagementInput build() {
      MarketingEngagementInput result = new MarketingEngagementInput();
      result.occurredOn = this.occurredOn;
      result.impressionsCount = this.impressionsCount;
      result.viewsCount = this.viewsCount;
      result.clicksCount = this.clicksCount;
      result.sharesCount = this.sharesCount;
      result.favoritesCount = this.favoritesCount;
      result.commentsCount = this.commentsCount;
      result.unsubscribesCount = this.unsubscribesCount;
      result.complaintsCount = this.complaintsCount;
      result.failsCount = this.failsCount;
      result.sendsCount = this.sendsCount;
      result.uniqueViewsCount = this.uniqueViewsCount;
      result.uniqueClicksCount = this.uniqueClicksCount;
      result.adSpend = this.adSpend;
      result.isCumulative = this.isCumulative;
      result.utcOffset = this.utcOffset;
      result.sales = this.sales;
      result.sessionsCount = this.sessionsCount;
      result.orders = this.orders;
      result.firstTimeCustomers = this.firstTimeCustomers;
      result.returningCustomers = this.returningCustomers;
      return result;
    }

    
    public Builder occurredOn(LocalDate occurredOn) {
      this.occurredOn = occurredOn;
      return this;
    }

    
    public Builder impressionsCount(Integer impressionsCount) {
      this.impressionsCount = impressionsCount;
      return this;
    }

    
    public Builder viewsCount(Integer viewsCount) {
      this.viewsCount = viewsCount;
      return this;
    }

    
    public Builder clicksCount(Integer clicksCount) {
      this.clicksCount = clicksCount;
      return this;
    }

    
    public Builder sharesCount(Integer sharesCount) {
      this.sharesCount = sharesCount;
      return this;
    }

    
    public Builder favoritesCount(Integer favoritesCount) {
      this.favoritesCount = favoritesCount;
      return this;
    }

    
    public Builder commentsCount(Integer commentsCount) {
      this.commentsCount = commentsCount;
      return this;
    }

    
    public Builder unsubscribesCount(Integer unsubscribesCount) {
      this.unsubscribesCount = unsubscribesCount;
      return this;
    }

    
    public Builder complaintsCount(Integer complaintsCount) {
      this.complaintsCount = complaintsCount;
      return this;
    }

    
    public Builder failsCount(Integer failsCount) {
      this.failsCount = failsCount;
      return this;
    }

    
    public Builder sendsCount(Integer sendsCount) {
      this.sendsCount = sendsCount;
      return this;
    }

    
    public Builder uniqueViewsCount(Integer uniqueViewsCount) {
      this.uniqueViewsCount = uniqueViewsCount;
      return this;
    }

    
    public Builder uniqueClicksCount(Integer uniqueClicksCount) {
      this.uniqueClicksCount = uniqueClicksCount;
      return this;
    }

    
    public Builder adSpend(MoneyInput adSpend) {
      this.adSpend = adSpend;
      return this;
    }

    
    public Builder isCumulative(boolean isCumulative) {
      this.isCumulative = isCumulative;
      return this;
    }

    
    public Builder utcOffset(String utcOffset) {
      this.utcOffset = utcOffset;
      return this;
    }

    
    public Builder sales(MoneyInput sales) {
      this.sales = sales;
      return this;
    }

    
    public Builder sessionsCount(Integer sessionsCount) {
      this.sessionsCount = sessionsCount;
      return this;
    }

    
    public Builder orders(String orders) {
      this.orders = orders;
      return this;
    }

    
    public Builder firstTimeCustomers(String firstTimeCustomers) {
      this.firstTimeCustomers = firstTimeCustomers;
      return this;
    }

    
    public Builder returningCustomers(String returningCustomers) {
      this.returningCustomers = returningCustomers;
      return this;
    }
  }
}
