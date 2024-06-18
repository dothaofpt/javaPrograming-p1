var courseSwiper = new Swiper(".course-swiper", {
    spaceBetween: 300,
    centeredSlides: true,
    autoplay: {
      delay: 2500,
      disableOnInteraction: false,
    },
    pagination: {
      el: ".course-swiper .swiper-pagination",
      clickable: true,
    },
    navigation: {
      nextEl: ".course-swiper .swiper-button-next",
      prevEl: ".course-swiper .swiper-button-prev",
    },
  });
  
  var popularSwiper = new Swiper(".popular-swiper", {
    slidesPerView: 3,
    spaceBetween: 0,
    pagination: {
      el: ".popular-swiper .swiper-pagination",
      clickable: true,
    },
    navigation: {
      nextEl: ".popular-swiper .swiper-button-next",
      prevEl: ".popular-swiper .swiper-button-prev",
    },
  });
  