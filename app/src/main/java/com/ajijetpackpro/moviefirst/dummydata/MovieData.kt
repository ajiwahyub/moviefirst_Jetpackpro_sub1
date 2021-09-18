package com.ajijetpackpro.moviefirst.dummydata

import com.ajijetpackpro.moviefirst.R
import com.ajijetpackpro.moviefirst.model.MovieList
import java.util.ArrayList

object MovieData {

    fun getDummyMovie(): List<MovieList> {
        val moviesItem = ArrayList<MovieList>()

        moviesItem.add(
            MovieList(
                "Cruella",
                8.7,
                "In 1970s London amidst the punk rock revolution, a young grifter named Estella is determined to make a name for herself with her designs. She befriends a pair of young thieves who appreciate her appetite for mischief, and together they are able to build a life for themselves on the London streets. One day, Estella’s flair for fashion catches the eye of the Baroness von Hellman, a fashion legend who is devastatingly chic and terrifyingly haute. But their relationship sets in motion a course of events and revelations that will cause Estella to embrace her wicked side and become the raucous, fashionable and revenge-bent Cruella.",
                0.toString(),
                "2021-03-31",
                "Horror",
                R.drawable.p_1,
                R.drawable.b_1
            )
        )
        moviesItem.add(
            MovieList(
                "Wrath of Man",
                7.9,
                "A cold and mysterious new security guard for a Los Angeles cash truck company surprises his co-workers when he unleashes precision skills during a heist. The crew is left wondering who he is and where he came from. Soon, the marksman's ultimate motive becomes clear as he takes dramatic and irrevocable steps to settle a score.",
                1.toString(),
                "2021-04-22",
                "Action",
                R.drawable.p_3,
                R.drawable.b_3
            )
        )
        moviesItem.add(
            MovieList(
                "Army of the Dead"
                ,6.6
                ,"Following a zombie outbreak in Las Vegas, a group of mercenaries take the ultimate gamble: venturing into the quarantine zone to pull off the greatest heist ever attempted."
                , 2.toString()
                ,"2021-05-14"
                ,"Action, Thriller"
                ,R.drawable.p_4
                ,R.drawable.b_4
            )
        )
        moviesItem.add(
            MovieList(
                "Spiral: From the Book of Saw"
                ,6.6
                ,"Working in the shadow of an esteemed police veteran, brash Detective Ezekiel “Zeke” Banks and his rookie partner take charge of a grisly investigation into murders that are eerily reminiscent of the city’s gruesome past.  Unwittingly entrapped in a deepening mystery, Zeke finds himself at the center of the killer’s morbid game."
                , 3.toString()
                ,"2021-05-12"
                ,"War, Action"
                ,R.drawable.p_5
                ,R.drawable.b_5

            )
        )
        moviesItem.add(
            MovieList(
                "Mortal Kombat"
                ,7.5
                ,"Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe."
                , 4.toString()
                ,"2021-04-07"
                ,"Fighting"
                ,R.drawable.p_6
                ,R.drawable.b_6

            )
        )
        moviesItem.add(
            MovieList(
                "Godzilla vs. Kong"
                ,8.1
                ,"In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages."
                , 5.toString()
                ,"2021-03-24"
                ,"Monster, Disaster"
                ,R.drawable.p_7
                ,R.drawable.b_7

            )
        )
        moviesItem.add(
            MovieList(
                "The Unholy"
                , 7.1
                ,"Alice, a young hearing-impaired girl who, after a supposed visitation from the Virgin Mary, is inexplicably able to hear, speak and heal the sick. As word spreads and people from near and far flock to witness her miracles, a disgraced journalist hoping to revive his career visits the small New England town to investigate. When terrifying events begin to happen all around, he starts to question if these phenomena are the works of the Virgin Mary or something much more sinister."
                , 6.toString()
                ,"2021-03-31"
                ,"Horror"
                ,R.drawable.p_2
                ,R.drawable.b_2

            )
        )
        moviesItem.add(
            MovieList(
                "Tom Clancy's Without Remorse"
                ,7.2
                ,"An elite Navy SEAL uncovers an international conspiracy while seeking justice for the murder of his pregnant wife."
                , 7.toString()
                ,"2021-04-29"
                ,"Action, Strategy"
                ,R.drawable.p_8
                ,R.drawable.b_8

            )
        )
        moviesItem.add(
            MovieList(
                "Those Who Wish Me Dead"
                ,7.0
                ,"A young boy finds himself pursued by two assassins in the Montana wilderness with a survival expert determined to protecting him - and a forest fire threatening to consume them all."
                , 8.toString()
                ,"2021-05-05"
                ,"Action, Survival"
                ,R.drawable.p_9
                ,R.drawable.b_9

            )
        )
        moviesItem.add(
            MovieList(
                "The Virtuoso"
                ,6.2
                ,"A lonesome stranger with nerves of steel must track down and kill a rogue hitman to satisfy an outstanding debt. But the only information he's been given is a time and location where to find his quarry. No name. No description. Nothing."
                , 9.toString()
                ,"2021-04-30"
                ,"Action, Criminal"
                ,R.drawable.p_10
                ,R.drawable.b_10

            )
        )
        return moviesItem
    }

    fun getDummyTvshows(): List<MovieList> {
        val tvshowsItem = ArrayList<MovieList>()

        tvshowsItem.add(
            MovieList(
                "Lucifer",
                8.5,
                "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                11.toString(),
                "2016-01-25",
                "Criminal, Drama,",
                R.drawable.b11
                ,R.drawable.p11
            )
        )
        tvshowsItem.add(
            MovieList(
                "The Flash",
                7.7,
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                12.toString(),
                "2014-10-07",
                "Drama, Sci-Fi & Fantasy",
                R.drawable.p12,
                R.drawable.b12
            )
        )
        tvshowsItem.add(
            MovieList(
                "Ragnarok",
                8.0,
                "A small Norwegian town experiencing warm winters and violent downpours seems to be headed for another Ragnarök -- unless someone intervenes in time.",
                13.toString(),
                "2020-01-31",
                "Crime, Sci-Fi & Fantasy",
                R.drawable.p13,
                R.drawable.b13

            )
        )
        tvshowsItem.add(
            MovieList(
                "The Good Doctor",
                8.6,
                "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                14.toString(),
                "2017-09-25",
                "Drama",
                R.drawable.p14,
                R.drawable.b14
            )
        )
        tvshowsItem.add(
            MovieList(
                "Grey's Anatomy",
                8.2,
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                15.toString(),
                "2005-03-27",
                "Drama",
                R.drawable.p15,
                R.drawable.b15
            )
        )
        tvshowsItem.add(
            MovieList(
                "The Falcon and the Winter Soldier",
                7.9,
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                16.toString(),
                "2021-03-19",
                "Sci-Fi & Fantasy, Action & Adventure, Drama, War & Politics",
                R.drawable.p16,
                R.drawable.b16
            )
        )
        tvshowsItem.add(
            MovieList(
                "Who Killed Sara?",
                7.8,
                "Hell-bent on exacting revenge and proving he was framed for his sister's murder, Álex sets out to unearth much more than the crime's real culprit.",
                17.toString(),
                "2021-03-24",
                "Mystery, Criminal, Drama",
                R.drawable.p17,
                R.drawable.b17
            )
        )
        tvshowsItem.add(
            MovieList(
                "Superman & Lois",
                8.3,
                "After years of facing megalomaniacal supervillains, monsters wreaking havoc on Metropolis, and alien invaders intent on wiping out the human race, The Man of Steel aka Clark Kent and Lois Lane come face to face with one of their greatest challenges ever: dealing with all the stress, pressures and complexities that come with being working parents in today's society.",
                18.toString(),
                "2021-02-23",
                "Action & Adventure, Sci-Fi & Fantasy, Drama",
                R.drawable.p18,
                R.drawable.b18
            )
        )
        tvshowsItem.add(
            MovieList(
                "Invincible",
                8.9,
                "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
                19.toString(),
                "2021-03-26",
                "Animation, Action & Adventure, Drama, Sci-Fi & Fantasy",
                R.drawable.p19,
                R.drawable.b19
            )
        )
        tvshowsItem.add(
            MovieList(
                "The Queen of Flow",
                8.0,
                "After spending seventeen years in prison unfairly, a talented songwriter seeks revenge on the men who sank her and killed her family.",
                20.toString(),
                "2018-06-12",
                "Drama",
                R.drawable.p20,
                R.drawable.b20
            )
        )
        return tvshowsItem
    }
}