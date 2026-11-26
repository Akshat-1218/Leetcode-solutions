SELECT id, visit_date, people
FROM (
    SELECT *,
           id - ROW_NUMBER() OVER (ORDER BY id) AS grp
    FROM Stadium
    WHERE people >= 100
) AS temp
WHERE grp IN (
    SELECT grp
    FROM (
        SELECT id - ROW_NUMBER() OVER (ORDER BY id) AS grp
        FROM Stadium
        WHERE people >= 100
    ) AS t
    GROUP BY grp
    HAVING COUNT(*) >= 3
)
ORDER BY visit_date;