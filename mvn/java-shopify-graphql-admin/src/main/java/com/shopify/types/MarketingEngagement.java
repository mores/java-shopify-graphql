package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;


public class MarketingEngagement {
  
  private MoneyV2 adSpend;

  
  private String channelHandle;

  
  private Integer clicksCount;

  
  private Integer commentsCount;

  
  private Integer complaintsCount;

  
  private Integer failsCount;

  
  private Integer favoritesCount;

  
  private String firstTimeCustomers;

  
  private Integer impressionsCount;

  
  private boolean isCumulative;

  
  private MarketingActivity marketingActivity;

  
  private LocalDate occurredOn;

  
  private String orders;

  
  private String returningCustomers;

  
  private MoneyV2 sales;

  
  private Integer sendsCount;

  
  private Integer sessionsCount;

  
  private Integer sharesCount;

  
  private Integer uniqueClicksCount;

  
  private Integer uniqueViewsCount;

  
  private Integer unsubscribesCount;

  
  private String utcOffset;

  
  private Integer viewsCount;

  public MarketingEngagement() {
  }

  
  public MoneyV2 getAdSpend() {
    return adSpend;
  }

  public void setAdSpend(MoneyV2 adSpend) {
    this.adSpend = adSpend;
  }

  
  public String getChannelHandle() {
    return channelHandle;
  }

  public void setChannelHandle(String channelHandle) {
    this.channelHandle = channelHandle;
  }

  
  public Integer getClicksCount() {
    return clicksCount;
  }

  public void setClicksCount(Integer clicksCount) {
    this.clicksCount = clicksCount;
  }

  
  public Integer getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Integer commentsCount) {
    this.commentsCount = commentsCount;
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

  
  public Integer getFavoritesCount() {
    return favoritesCount;
  }

  public void setFavoritesCount(Integer favoritesCount) {
    this.favoritesCount = favoritesCount;
  }

  
  public String getFirstTimeCustomers() {
    return firstTimeCustomers;
  }

  public void setFirstTimeCustomers(String firstTimeCustomers) {
    this.firstTimeCustomers = firstTimeCustomers;
  }

  
  public Integer getImpressionsCount() {
    return impressionsCount;
  }

  public void setImpressionsCount(Integer impressionsCount) {
    this.impressionsCount = impressionsCount;
  }

  
  public boolean getIsCumulative() {
    return isCumulative;
  }

  public void setIsCumulative(boolean isCumulative) {
    this.isCumulative = isCumulative;
  }

  
  public MarketingActivity getMarketingActivity() {
    return marketingActivity;
  }

  public void setMarketingActivity(MarketingActivity marketingActivity) {
    this.marketingActivity = marketingActivity;
  }

  
  public LocalDate getOccurredOn() {
    return occurredOn;
  }

  public void setOccurredOn(LocalDate occurredOn) {
    this.occurredOn = occurredOn;
  }

  
  public String getOrders() {
    return orders;
  }

  public void setOrders(String orders) {
    this.orders = orders;
  }

  
  public String getReturningCustomers() {
    return returningCustomers;
  }

  public void setReturningCustomers(String returningCustomers) {
    this.returningCustomers = returningCustomers;
  }

  
  public MoneyV2 getSales() {
    return sales;
  }

  public void setSales(MoneyV2 sales) {
    this.sales = sales;
  }

  
  public Integer getSendsCount() {
    return sendsCount;
  }

  public void setSendsCount(Integer sendsCount) {
    this.sendsCount = sendsCount;
  }

  
  public Integer getSessionsCount() {
    return sessionsCount;
  }

  public void setSessionsCount(Integer sessionsCount) {
    this.sessionsCount = sessionsCount;
  }

  
  public Integer getSharesCount() {
    return sharesCount;
  }

  public void setSharesCount(Integer sharesCount) {
    this.sharesCount = sharesCount;
  }

  
  public Integer getUniqueClicksCount() {
    return uniqueClicksCount;
  }

  public void setUniqueClicksCount(Integer uniqueClicksCount) {
    this.uniqueClicksCount = uniqueClicksCount;
  }

  
  public Integer getUniqueViewsCount() {
    return uniqueViewsCount;
  }

  public void setUniqueViewsCount(Integer uniqueViewsCount) {
    this.uniqueViewsCount = uniqueViewsCount;
  }

  
  public Integer getUnsubscribesCount() {
    return unsubscribesCount;
  }

  public void setUnsubscribesCount(Integer unsubscribesCount) {
    this.unsubscribesCount = unsubscribesCount;
  }

  
  public String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  
  public Integer getViewsCount() {
    return viewsCount;
  }

  public void setViewsCount(Integer viewsCount) {
    this.viewsCount = viewsCount;
  }

  @Override
  public String toString() {
    return "MarketingEngagement{adSpend='" + adSpend + "', channelHandle='" + channelHandle + "', clicksCount='" + clicksCount + "', commentsCount='" + commentsCount + "', complaintsCount='" + complaintsCount + "', failsCount='" + failsCount + "', favoritesCount='" + favoritesCount + "', firstTimeCustomers='" + firstTimeCustomers + "', impressionsCount='" + impressionsCount + "', isCumulative='" + isCumulative + "', marketingActivity='" + marketingActivity + "', occurredOn='" + occurredOn + "', orders='" + orders + "', returningCustomers='" + returningCustomers + "', sales='" + sales + "', sendsCount='" + sendsCount + "', sessionsCount='" + sessionsCount + "', sharesCount='" + sharesCount + "', uniqueClicksCount='" + uniqueClicksCount + "', uniqueViewsCount='" + uniqueViewsCount + "', unsubscribesCount='" + unsubscribesCount + "', utcOffset='" + utcOffset + "', viewsCount='" + viewsCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingEngagement that = (MarketingEngagement) o;
    return Objects.equals(adSpend, that.adSpend) &&
        Objects.equals(channelHandle, that.channelHandle) &&
        Objects.equals(clicksCount, that.clicksCount) &&
        Objects.equals(commentsCount, that.commentsCount) &&
        Objects.equals(complaintsCount, that.complaintsCount) &&
        Objects.equals(failsCount, that.failsCount) &&
        Objects.equals(favoritesCount, that.favoritesCount) &&
        Objects.equals(firstTimeCustomers, that.firstTimeCustomers) &&
        Objects.equals(impressionsCount, that.impressionsCount) &&
        isCumulative == that.isCumulative &&
        Objects.equals(marketingActivity, that.marketingActivity) &&
        Objects.equals(occurredOn, that.occurredOn) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(returningCustomers, that.returningCustomers) &&
        Objects.equals(sales, that.sales) &&
        Objects.equals(sendsCount, that.sendsCount) &&
        Objects.equals(sessionsCount, that.sessionsCount) &&
        Objects.equals(sharesCount, that.sharesCount) &&
        Objects.equals(uniqueClicksCount, that.uniqueClicksCount) &&
        Objects.equals(uniqueViewsCount, that.uniqueViewsCount) &&
        Objects.equals(unsubscribesCount, that.unsubscribesCount) &&
        Objects.equals(utcOffset, that.utcOffset) &&
        Objects.equals(viewsCount, that.viewsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adSpend, channelHandle, clicksCount, commentsCount, complaintsCount, failsCount, favoritesCount, firstTimeCustomers, impressionsCount, isCumulative, marketingActivity, occurredOn, orders, returningCustomers, sales, sendsCount, sessionsCount, sharesCount, uniqueClicksCount, uniqueViewsCount, unsubscribesCount, utcOffset, viewsCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 adSpend;

    
    private String channelHandle;

    
    private Integer clicksCount;

    
    private Integer commentsCount;

    
    private Integer complaintsCount;

    
    private Integer failsCount;

    
    private Integer favoritesCount;

    
    private String firstTimeCustomers;

    
    private Integer impressionsCount;

    
    private boolean isCumulative;

    
    private MarketingActivity marketingActivity;

    
    private LocalDate occurredOn;

    
    private String orders;

    
    private String returningCustomers;

    
    private MoneyV2 sales;

    
    private Integer sendsCount;

    
    private Integer sessionsCount;

    
    private Integer sharesCount;

    
    private Integer uniqueClicksCount;

    
    private Integer uniqueViewsCount;

    
    private Integer unsubscribesCount;

    
    private String utcOffset;

    
    private Integer viewsCount;

    public MarketingEngagement build() {
      MarketingEngagement result = new MarketingEngagement();
      result.adSpend = this.adSpend;
      result.channelHandle = this.channelHandle;
      result.clicksCount = this.clicksCount;
      result.commentsCount = this.commentsCount;
      result.complaintsCount = this.complaintsCount;
      result.failsCount = this.failsCount;
      result.favoritesCount = this.favoritesCount;
      result.firstTimeCustomers = this.firstTimeCustomers;
      result.impressionsCount = this.impressionsCount;
      result.isCumulative = this.isCumulative;
      result.marketingActivity = this.marketingActivity;
      result.occurredOn = this.occurredOn;
      result.orders = this.orders;
      result.returningCustomers = this.returningCustomers;
      result.sales = this.sales;
      result.sendsCount = this.sendsCount;
      result.sessionsCount = this.sessionsCount;
      result.sharesCount = this.sharesCount;
      result.uniqueClicksCount = this.uniqueClicksCount;
      result.uniqueViewsCount = this.uniqueViewsCount;
      result.unsubscribesCount = this.unsubscribesCount;
      result.utcOffset = this.utcOffset;
      result.viewsCount = this.viewsCount;
      return result;
    }

    
    public Builder adSpend(MoneyV2 adSpend) {
      this.adSpend = adSpend;
      return this;
    }

    
    public Builder channelHandle(String channelHandle) {
      this.channelHandle = channelHandle;
      return this;
    }

    
    public Builder clicksCount(Integer clicksCount) {
      this.clicksCount = clicksCount;
      return this;
    }

    
    public Builder commentsCount(Integer commentsCount) {
      this.commentsCount = commentsCount;
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

    
    public Builder favoritesCount(Integer favoritesCount) {
      this.favoritesCount = favoritesCount;
      return this;
    }

    
    public Builder firstTimeCustomers(String firstTimeCustomers) {
      this.firstTimeCustomers = firstTimeCustomers;
      return this;
    }

    
    public Builder impressionsCount(Integer impressionsCount) {
      this.impressionsCount = impressionsCount;
      return this;
    }

    
    public Builder isCumulative(boolean isCumulative) {
      this.isCumulative = isCumulative;
      return this;
    }

    
    public Builder marketingActivity(MarketingActivity marketingActivity) {
      this.marketingActivity = marketingActivity;
      return this;
    }

    
    public Builder occurredOn(LocalDate occurredOn) {
      this.occurredOn = occurredOn;
      return this;
    }

    
    public Builder orders(String orders) {
      this.orders = orders;
      return this;
    }

    
    public Builder returningCustomers(String returningCustomers) {
      this.returningCustomers = returningCustomers;
      return this;
    }

    
    public Builder sales(MoneyV2 sales) {
      this.sales = sales;
      return this;
    }

    
    public Builder sendsCount(Integer sendsCount) {
      this.sendsCount = sendsCount;
      return this;
    }

    
    public Builder sessionsCount(Integer sessionsCount) {
      this.sessionsCount = sessionsCount;
      return this;
    }

    
    public Builder sharesCount(Integer sharesCount) {
      this.sharesCount = sharesCount;
      return this;
    }

    
    public Builder uniqueClicksCount(Integer uniqueClicksCount) {
      this.uniqueClicksCount = uniqueClicksCount;
      return this;
    }

    
    public Builder uniqueViewsCount(Integer uniqueViewsCount) {
      this.uniqueViewsCount = uniqueViewsCount;
      return this;
    }

    
    public Builder unsubscribesCount(Integer unsubscribesCount) {
      this.unsubscribesCount = unsubscribesCount;
      return this;
    }

    
    public Builder utcOffset(String utcOffset) {
      this.utcOffset = utcOffset;
      return this;
    }

    
    public Builder viewsCount(Integer viewsCount) {
      this.viewsCount = viewsCount;
      return this;
    }
  }
}
