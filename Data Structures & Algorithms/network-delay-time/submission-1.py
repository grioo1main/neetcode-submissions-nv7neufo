class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        adj = defaultdict(list)
        for u, v, w in times:
            adj[u].append((v, w))
        dist = [float('inf')] * (n+1)
        dist[k] = 0
        pq = [(0, k)]
        while pq:
            current_dist, u = heapq.heappop(pq)
        
            if current_dist > dist[u]:
                continue
            
            for neighbor, weight in adj[u]:
                if dist[u] + weight < dist[neighbor]:
                   dist[neighbor] = dist[u] + weight
                   heapq.heappush(pq, (dist[neighbor], neighbor))
        max_time = max(dist[1:])
        return max_time if max_time != float('inf') else -1


