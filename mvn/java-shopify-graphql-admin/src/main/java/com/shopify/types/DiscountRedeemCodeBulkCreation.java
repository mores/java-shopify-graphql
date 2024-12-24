package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountRedeemCodeBulkCreation implements com.shopify.types.Node {
  
  private DiscountRedeemCodeBulkCreationCodeConnection codes;

  
  private int codesCount;

  
  private OffsetDateTime createdAt;

  
  private DiscountCodeNode discountCode;

  
  private boolean done;

  
  private int failedCount;

  
  private String id;

  
  private int importedCount;

  public DiscountRedeemCodeBulkCreation() {
  }

  
  public DiscountRedeemCodeBulkCreationCodeConnection getCodes() {
    return codes;
  }

  public void setCodes(DiscountRedeemCodeBulkCreationCodeConnection codes) {
    this.codes = codes;
  }

  
  public int getCodesCount() {
    return codesCount;
  }

  public void setCodesCount(int codesCount) {
    this.codesCount = codesCount;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public DiscountCodeNode getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(DiscountCodeNode discountCode) {
    this.discountCode = discountCode;
  }

  
  public boolean getDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  
  public int getFailedCount() {
    return failedCount;
  }

  public void setFailedCount(int failedCount) {
    this.failedCount = failedCount;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public int getImportedCount() {
    return importedCount;
  }

  public void setImportedCount(int importedCount) {
    this.importedCount = importedCount;
  }

  @Override
  public String toString() {
    return "DiscountRedeemCodeBulkCreation{codes='" + codes + "', codesCount='" + codesCount + "', createdAt='" + createdAt + "', discountCode='" + discountCode + "', done='" + done + "', failedCount='" + failedCount + "', id='" + id + "', importedCount='" + importedCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountRedeemCodeBulkCreation that = (DiscountRedeemCodeBulkCreation) o;
    return Objects.equals(codes, that.codes) &&
        codesCount == that.codesCount &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(discountCode, that.discountCode) &&
        done == that.done &&
        failedCount == that.failedCount &&
        Objects.equals(id, that.id) &&
        importedCount == that.importedCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(codes, codesCount, createdAt, discountCode, done, failedCount, id, importedCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountRedeemCodeBulkCreationCodeConnection codes;

    
    private int codesCount;

    
    private OffsetDateTime createdAt;

    
    private DiscountCodeNode discountCode;

    
    private boolean done;

    
    private int failedCount;

    
    private String id;

    
    private int importedCount;

    public DiscountRedeemCodeBulkCreation build() {
      DiscountRedeemCodeBulkCreation result = new DiscountRedeemCodeBulkCreation();
      result.codes = this.codes;
      result.codesCount = this.codesCount;
      result.createdAt = this.createdAt;
      result.discountCode = this.discountCode;
      result.done = this.done;
      result.failedCount = this.failedCount;
      result.id = this.id;
      result.importedCount = this.importedCount;
      return result;
    }

    
    public Builder codes(DiscountRedeemCodeBulkCreationCodeConnection codes) {
      this.codes = codes;
      return this;
    }

    
    public Builder codesCount(int codesCount) {
      this.codesCount = codesCount;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder discountCode(DiscountCodeNode discountCode) {
      this.discountCode = discountCode;
      return this;
    }

    
    public Builder done(boolean done) {
      this.done = done;
      return this;
    }

    
    public Builder failedCount(int failedCount) {
      this.failedCount = failedCount;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder importedCount(int importedCount) {
      this.importedCount = importedCount;
      return this;
    }
  }
}
