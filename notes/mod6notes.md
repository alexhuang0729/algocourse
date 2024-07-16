# Merge Sort
#sorting

[Sorting](https://docs.google.com/document/d/1dUfzdh5V3okrwFbB9o0PgtEBaLHyCqJFwpQWyQ53IeU/edit)
Basic plan
- Divide array into two halves
- Recursively sort each half
- Merge two halves

1. Split the array in half
	**![](https://lh7-us.googleusercontent.com/docsz/AD_4nXct239W_hPt5CizUBHeww4IxkBlRidQ6npo7zIz_5_tGrphhukAlMh6-dvqQlxLzJzrQduxKJzimkzzlEvtyajm3Wzi-51KAQOqSdoIau_eXrYGQkoMhS989WKQMCNR4mk-reRUFW_tyFHk-d2hb8oq6lk?key=4PMGWcLcK0Il8gK27Fjr7Q)**
2. Recursively split the left side in half until you reach a set of 2 or less
	**![](https://lh7-us.googleusercontent.com/docsz/AD_4nXfzfpeUx6-Y3RLW0FhWyT5r5sOeeWZm1tcBwwI5gh9fyU2i4WaedPzS48buAIGCCaB7XsXQd9gI-VFOKbeMEQi1g8nhCBnl5p4sSMM1lUYP6O1EpxdV6UMk0YA-E-lntlkicYV-5hhi5e9WG_XLYfXKQV0?key=4PMGWcLcK0Il8gK27Fjr7Q)**
3. If necessary swap the two values so that the small set is sorted
	**![](https://lh7-us.googleusercontent.com/docsz/AD_4nXf_iiLBoTS4oh07NPlP3cpFKuP9-VCse8hIilUheuqmuyiPglUF7nyxbR7h6CSgfyoN2uVJxW0h-6Cn6soSIXSUhu2yhpcWBK_Ps7W0SYCiprR6mSxzGm6FY4ZT8Az8ozcMPZbl5ZoHmrT4NTwiSUuaPQ?key=4PMGWcLcK0Il8gK27Fjr7Q)**
4. Repeat for all sets on the right side
	**![](https://lh7-us.googleusercontent.com/docsz/AD_4nXdYsKuAu3n-Tf7Okk7nP1kBsAHWKyQag_LAR57h9UFlSBUXeGiAs7S_MwOA-F2J8Q4qPtsnRfKstpkUQQeZxjHgYushSD9wXVomhTrY-5gXwqDPLsKPkK9iEmTPjDsVfp44U2miqCg8Ag-Cco-wBR8WtQc?key=4PMGWcLcK0Il8gK27Fjr7Q)**
5. Once two halves have been sorted, it's merge time!
	- Start with (ptr1) and (ptr2) on the leftmost elements of each set respectively
		**![](https://lh7-us.googleusercontent.com/docsz/AD_4nXe-mAPi3xN44z_WOYjCtKXZbTWxsmK6UStdn3L-tzLbvT9NlbiC7Wt6B2tpvsNXU1Umf31kK6rAqWdu7Td8BMcqgQJCvlPmbbCy7ELy8Yrx_QuA2Wv05fQXzoQx355am1eGwAGP2MTrU1Fuq60_-tob54o?key=4PMGWcLcK0Il8gK27Fjr7Q)**
	- Copy the lower of the two elements into a new array, and increment the pointer that was pointing to that element. (If al elements from one set were already added, just add the rest from the other set)
		**![](https://lh7-us.googleusercontent.com/docsz/AD_4nXfu62r5k6tzDDE8nbJR24V-cVmGAaIA5wVp2nHZuGiukVIESSYbcjRG2lSpbAoFQxWSsti_sGW3ZsBH1nxPAVWpB-kAt2aVHqxnO5uSVoSd6_A9FpzdXgJTGsX-v2nLKkz1ef-bdFik4rlX-srWAT2D1XQ?key=4PMGWcLcK0Il8gK27Fjr7Q)**
	- Continue until both sets are merged into one sorted set
		**![](https://lh7-us.googleusercontent.com/docsz/AD_4nXc6Iiz4igHgoRZ0z1OdsEE4jvdkQdVeI7A5E4E9xwgnGMPGYd0-ckFTCK5rp9UEFQmUldso3FjzKmXsPuGGzm7zRhHVc3ih3l1ofeGZ-d9EM0Bt0G6Fxqw96CqTNiH0eoZgb-qYuDBBxzhwjJ8qHfDpYw?key=4PMGWcLcK0Il8gK27Fjr7Q)**
	- Copy the merged set back into the original array and repeat from step 2, but doing the right side this time
		**![](https://lh7-us.googleusercontent.com/docsz/AD_4nXfkbtybxtSDsJe96CoArzJyduqgUFCeWCqJObylMjOr5BMOnoDrtYBK94M3FXaYtmkLyhS3Pv3_6-LjU5m03PXpv1SSx0iEy1iZR0PaQa2eJGruSYzfzqtWoi81-Woj2YswmrQAPWcRu_UqyIhaAY46NzU?key=4PMGWcLcK0Il8gK27Fjr7Q)**
		