package com.common.util;

import com.common.constants.MessageConstants;
import com.common.enums.CERTIFICATETYPE;

import lombok.Getter;
import lombok.Setter;

public class DonorRewardUtil {
	
	   @Getter
	   @Setter
	    public static class Reward {
	        private CERTIFICATETYPE certificateType;
	        private String title;

	        public Reward(CERTIFICATETYPE certificateType, String title) {
	            this.certificateType = certificateType;
	            this.title = title;
	        }
	    }

	    public static Reward getRewardByTotalDonations(int totalDonations) {
	        if (totalDonations == 1) {
	            return new Reward(CERTIFICATETYPE.POINTS, MessageConstants.FIRST_DROP_HERO);
	        } else if (totalDonations >= 2 && totalDonations <= 3) {
	            return new Reward(CERTIFICATETYPE.COUPON, MessageConstants.SILVER_DONOR_AWARD);
	        } else if (totalDonations >= 4 && totalDonations <= 5) {
	            return new Reward(CERTIFICATETYPE.VOUCHER, MessageConstants.GOLDEN_DONOR_BADGE);
	        } else if (totalDonations >= 6 && totalDonations <= 10) {
	            return new Reward(CERTIFICATETYPE.BADGE, MessageConstants.PLATINUM_LIFE_SAVER);
	        } else {
	            return new Reward(CERTIFICATETYPE.CERTIFICATE, MessageConstants.LEGENDARY_DONOR_HONOR);
	        }
	    }
	


}
