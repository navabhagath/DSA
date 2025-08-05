class Solution:
    def maxKelements(self, nums: List[int], k: int) -> int:
        max_heap = [-x for x in sorted(nums, reverse=True)[:k]]
        ans = 0

        for _ in range(k):
            max_element = heapq.heappop(max_heap)
            ans -= max_element
            heapq.heappush(max_heap, max_element // 3)
        
        return ans