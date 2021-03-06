package io.bumo.sdk.core.adapter.bc.response.operation;

import com.alibaba.fastjson.annotation.JSONField;

import io.bumo.sdk.core.adapter.bc.common.Signer;

/**
 * 设置权重
 *
 * @author bumo
 */
public class SetSignerWeight{
    /**
     * 权重
     */
    @JSONField(name = "master_weight")
    private long masterWeight;
    /**
     * 签名者
     */
    private Signer[] signers;

    public long getMasterWeight(){
        return masterWeight;
    }

    public void setMasterWeight(long masterWeight){
        this.masterWeight = masterWeight;
    }

    public Signer[] getSigners(){
        return signers;
    }

    public void setSigners(Signer[] signers){
        this.signers = signers;
    }
}
