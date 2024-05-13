package com.example.woof.data

import com.example.woof.R

object DataProvider {

    val knine =
        Knine(
            id = 1,
            name = "Belgian Malinois",
            from = "Belgium",
            desc = "For police dog",
            knineImageId = R.drawable.k9bel
        )

    val knineList = listOf(

        knine,
        Knine(
            id = 2,
            name = "Boxer",
            from = "Belgium",
            desc = "For police dog",
            knineImageId = R.drawable.k9box
        ),
        Knine(
            id = 3,
            name = "Cane Corso",
            from = "Belgium",
            desc = "For police dog",
            knineImageId = R.drawable.k9cane
        ),
        Knine(
            id = 4,
            name = "Dalmation",
            from = "Belgium",
            desc = "For police dog",
            knineImageId = R.drawable.k9dal
        ),
        Knine(
            id = 5,
            name = "Dobermann",
            from = "Belgium",
            desc = "For police dog",
            knineImageId = R.drawable.k9dob
        ),
        Knine(
            id = 6,
            name = "German Shepherd",
            from = "Germany",
            desc = "For police dog",
            knineImageId = R.drawable.k9gsd
        ),
        Knine(
            id = 7,
            name = "Kangal",
            from = "Belgium",
            desc = "For police dog",
            knineImageId = R.drawable.k9kgl
        ),
        Knine(
            id = 8,
            name = "Tibetan Mastiff",
            from = "Belgium",
            desc = "For police dog",
            knineImageId = R.drawable.k9mstf
        ),
        Knine(
            id = 9,
            name = "Rottweiler",
            from = "Belgium",
            desc = "For police dog",
            knineImageId = R.drawable.k9rot
        ),
        Knine(
            id = 10,
            name = "Saint Bernard",
            from = "Belgium",
            desc = "For police dog",
            knineImageId = R.drawable.k9stbr
        ),
    )
}